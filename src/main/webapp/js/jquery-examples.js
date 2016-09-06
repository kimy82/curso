var JqueryExamples = {
	dialog: null,
	progressInterval : null,
	_init : function() {
		$("#date").datepicker();
		$("#progressbar").progressbar({
			value : 37,
			change : function() {
				console.log("Has changed!");
			}
		});
		$("#accordion").accordion();
		this.dialog = $( "#dialog" ).dialog({closeOnEscape: false,  autoOpen: false});
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
	openDialog: function(){
		$( this.dialog ).dialog( "open" );
	},
	closeDialog: function(){
		$( this.dialog ).dialog( "close" );
	}
};

$(function() {
	JqueryExamples._init();
});
