<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
 
<html>
<head>
	<title>ExtJS Grid增删改查</title>
	
	<!-- ExtJS css -->
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/ext/resources/css/ext-all.css" />
	
	<!-- Row Editor plugin css -->
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/ext/examples/ux/css/ux-all.css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/ext/examples/shared/examples.css" />

	<!-- App custom css -->
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/crudgrid.css" />
	
	<!-- ExtJS js -->
	<script src="${ctx}/resources/ext/adapter/ext/ext-base.js"></script>
	<script src="${ctx}/resources/ext/ext-all.js"></script>
	<script src="${ctx}/resources/ext/ext-lang-zh_CN.js"></script>
	
	<!-- Row Editor plugin js -->
	<script src="${ctx}/resources/ext/examples/ux/ux-all.js"></script>
	
	<!-- App js -->
	<script src="${ctx}/resources/crud-grid.js"></script>
	
	
	
</head>
<body>
	<div id="crud-grid"></div>
</body>
</html>