package com.suppresswarnings.osgi.command;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.slf4j.LoggerFactory;

import com.suppresswarnings.osgi.data.DataService;

public class Commander implements CommandProvider {
	DataService dataService;
	org.slf4j.Logger logger = LoggerFactory.getLogger("SYSTEM");
	
	public void data(DataService leveldb) {
		logger.info("[Commander] init dataService: " + leveldb);
		this.dataService = leveldb;
	}
	public void clearData(DataService leveldb) {
		logger.info("[Commander] release dataService: msg:" + leveldb + " here:" + this.dataService);
		this.dataService = null;
	}

	@Override
	public String getHelp() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("---Generated by LiJiaming---\n");
		buffer.append("\tshowdata - show Data by dataService.\n");
		return buffer.toString();
	}
	
	public void _showdata(CommandInterpreter ci) {
		System.out.println("[Commander] show Data by dataService: " + dataService);
		logger.info("[Commander] show Data by dataService: " + dataService);
	}
}