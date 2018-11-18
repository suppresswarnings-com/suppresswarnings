$.ajax({
	url : "/wx.http?r=" + Math.random(),
	data : {
		action : "payment",
		random : randnum,
		ticket : ticket,
		state : state
	},
	success : function(result) {
		if ("fail" == result) {
			console.log('fail to access_token: ' + result)
		} else {
			console.log('great lijiaming')
			var goods = JSON.parse(result)
			$("#reason").text(goods.reason)
			$("#what").text(goods.what)
			$("#userimg").attr("src", goods.userimg)
			closeDiv()
		}
	},
	error : function(xhr, result, obj) {
		console.log("[lijiaming] check payment err: " + result)
	}
})