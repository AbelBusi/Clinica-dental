<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="compon/header.jsp"%>
<%@include file="compon/bodyPrimeraParte.jsp"%>

<h1>Editar Usuarios</h1>
<p>En este apartado se podra editar a los usuarios guardados</p>

<% Usuario usu= (Usuario) request.getSession().getAttribute("editarUser"); %>

<form class="user" action="SvEditUser" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="user" name="nombreusu"
                   placeholder="Nombre usuario" value="<%=usu.getUsuario() %>">
        </div>
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="pass" name="password"
                   placeholder="Password" value="<%=usu.getPassword()%>">
        </div>

        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="roles"
                   placeholder="Rol" value="<%=usu.getRol()%>">
        </div>
    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Guardar informacion
    </button>
    
</form>


<%@include file="compon/bodyFinal.jsp" %>
