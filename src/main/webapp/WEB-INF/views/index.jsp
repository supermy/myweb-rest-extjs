<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>CRUD ExtJS Grid</title>
	
	<!-- ExtJS css -->
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/ext-3.2.1/resources/css/ext-all.css" />
	
	<!-- Row Editor plugin css -->
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/ext-3.2.1/examples/ux/css/RowEditor.css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/ext-3.2.1/examples/shared/examples.css" />
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/ext-3.2.1/examples/ux/css/RowEditor.css" />

	<!-- App custom css -->
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/crudgrid.css" />
	
	<!-- ExtJS js -->
	<script src="${ctx}/resources/ext-3.2.1/adapter/ext/ext-base.js"></script>
	<script src="${ctx}/resources/ext-3.2.1/ext-all.js"></script>
	
	<!-- Row Editor plugin js -->
	<script src="${ctx}/resources/ext-3.2.1/examples/ux/RowEditor.js"></script>
	
	<!-- App js -->
	<script src="${ctx}/resources/crud-grid.js"></script>
	
</head>
<body>
	<div id="crud-grid"></div>
</body>
</html>