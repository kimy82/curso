<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jquery</title>
<link href="http://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
<script src="<c:url value="/webjars/jquery/3.1.0/jquery.js" />" type="text/javascript"></script>
<script src="<c:url value="/webjars/jquery-ui/1.12.0/jquery-ui.js" />" type="text/javascript"></script>
<script src="<c:url value="/js/jquery-examples.js" />"></script>
<link rel="stylesheet" type="text/css" href="<c:url value="/css/curso.css" />" />
</head>
<body>
	<div id="main">
		<div class="card">
			<div class="el"></div>
			<div class="el"></div>
			<div class="el-on">
				<input type="text" id="input-test-id" value="My value Input">
				<div class="div-to">
					<p>Some html</p>
				</div>
			</div>
			<p>* Change the p tag that says Some html with the value in the input text</p>
		</div>
		<div class="card">
			<h2>DATEPICKER</h2>
			<input type="text" name="date" id="date">
			<p> Add a span with the current date selected:</p>
		</div>
		<div class="card">
			<h2>PROGRESSBAR</h2>
			<div id="progressbar"></div>
			<button id="start-progress">Start</button>
			<button id="stop-progress">Stop</button>
			<p>* Add 3 buttons:</p>
			<ul>
				<li>Start the progress bar</li>
				<li>Stop the progress bar</li>
				<li>Change the style</li>
			</ul>
		</div>
		<div id="dialog" title="Basic dialog">
			<p>This is the default dialog which is useful for displaying information. The dialog window can be moved, resized and closed with the 'x' icon.</p>
		</div>
		<div class="card">
			<h2>ACCORDION</h2>
			<div id="accordion">
				<h3>Section 1</h3>
				<div>
					<p>Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integer ut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sit amet, nunc. Nam a nibh.
						Donec suscipit eros. Nam mi. Proin viverra leo ut odio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.</p>
				</div>
				<h3>Section 2</h3>
				<div>
					<p>Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor velit, faucibus
						interdum tellus libero ac justo. Vivamus non quam. In suscipit faucibus urna.</p>
				</div>
				<h3>Section 3</h3>
				<div>
					<p>Nam enim risus, molestie et, porta ac, aliquam ac, risus. Quisque lobortis. Phasellus pellentesque purus in massa. Aenean in pede. Phasellus ac libero ac tellus
						pellentesque semper. Sed ac felis. Sed commodo, magna quis lacinia ornare, quam ante aliquam nisi, eu iaculis leo purus venenatis dui.</p>
					<ul>
						<li>List item one</li>
						<li>List item two</li>
						<li>List item three</li>
					</ul>
				</div>
				<h3>Section 4</h3>
				<div>
					<p>Cras dictum. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum ante ipsum primis in faucibus orci luctus et
						ultrices posuere cubilia Curae; Aenean lacinia mauris vel est.</p>
					<p>Suspendisse eu nisl. Nullam ut libero. Integer dignissim consequat lectus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.</p>
				</div>
			</div>
			<p>Set the default active to be the 2 one instead of the first one</p>
		</div>
</body>
</html>