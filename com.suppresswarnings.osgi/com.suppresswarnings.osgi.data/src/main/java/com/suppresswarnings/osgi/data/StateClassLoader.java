package com.suppresswarnings.osgi.data;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class StateClassLoader extends ClassLoader {
	public StateClassLoader(ClassLoader parent) {
		super(parent);
	}
	Map<String, Class<?>> classes = new HashMap<String, Class<?>>();
	byte[] bytes;
	public StateClassLoader of(byte[] bs) {
		this.bytes = bs;
		return this;
	}
	
	@Override
	protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
		System.err.println("Loading..." + name);
		if(name == null) {
			Object clas = classes.get(name);
			if(clas != null) {
				return (Class<?>) clas;
			} else {
				Class<?> klass = defineClass(name, bytes, 0, bytes.length);  
		        if (resolve) {
		        	resolveClass(klass);  
		        }
		        classes.put(name, klass);  
		        return klass;
			}
		} else {
			Object cache = classes.get(name);
			if(cache != null) {
				Class<?> clazz = (Class<?>) cache;
				if(resolve) super.resolveClass(clazz);
				return clazz;
			} else {
				return super.loadClass(name, resolve);
			}
		}
	}
	
	/**
	 * 
	 * Loading...null
	 * Loading...com.suppresswarnings.osgi.data.State
	 * Loading...java.lang.Object
	 * Loading...java.lang.String
	 * Loading...java.lang.System
	 * Loading...java.io.PrintStream
	 * nono name = nono@7852e922
	 * nono accept
	 * nono apply
	 * Loading...com.suppresswarnings.osgi.data.ExampleState
	 * com.suppresswarnings.osgi.data.ExampleState$4@4e25154f
	 * 
	 * @param args
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception{
		StateClassLoader loader = new StateClassLoader(Thread.currentThread().getContextClassLoader());
		byte[] bytes = Files.readAllBytes(Paths.get("D:/tmp/nono.class"));
		Class clazz = loader.of(bytes).loadClass(null, true);
		State s0 = (State) clazz.newInstance();
		System.out.println(s0.name() + " = " + s0.toString());
		s0.accept("lijiaming", null);
		State s2 = (State) s0.apply("haha", null);
		System.out.println(s2);
		Class cls = loader.of(bytes).loadClass(null, true);
		State old = (State) cls.newInstance();
		System.out.println(old.name());
	}
}