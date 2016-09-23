var JqueryExamples = {
	dialog : null,
	progressInterval : null,
	_init : function() {
		$("#date").datepicker({
			onSelect : function(date, inst) {
				console.log(date);
			}
		});
		$("#progressbar").progressbar({
			value : 37,
			change : function() {
				console.log("Has changed!");
			}
		});

		$("#start-progress").click($.proxy(this.runProgress, this));

		$("#stop-progress").click($.proxy(this.stopProgress, this));

		$("#accordion").accordion();
		this.dialog = $("#dialog").dialog({
			autoOpen : false
		});
	},
	getDate : function() {
		return $("#date").val();
	},
	runProgress : function() {

		this.progressInterval = setInterval(function() {
			$("#progressbar").progressbar({
				value : JqueryExamples._getNextProgressValue()
			});
		}, 1000);
	},
	stopProgress : function() {
		clearInterval(this.progressInterval);
		this.progressInterval = null;
	},
	_getNextProgressValue : function() {
		return parseInt($("#progressbar").progressbar("value")) + 1;
	},
	changeProgessBarType : function() {
		$("#progressbar").progressbar({
			value : false
		});
	},
	openDialog : function() {
		$(this.dialog).dialog("open");
	},
	closeDialog : function() {
		$(this.dialog).dialog("close");
	},
	getAjaxJSON : function() {
		$.ajax({
			type : "GET",
			url : "/struts/ajax.do",
			contentType : "application/json",
			dataType : "json",
			success : function(response) {
				console.log(response);
			},
			error : function(response) {
				console.log(response);
			}
		});
	}
};

$(function() {
	JqueryExamples._init();
});
