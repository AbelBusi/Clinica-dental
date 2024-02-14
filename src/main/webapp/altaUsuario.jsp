<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="compon/header.jsp"%>
<%@include file="compon/bodyPrimeraParte.jsp"%>

<h1>Alta Usuarios</h1>
<p>Este es un formulario para usuarios</p>
<form class="user" action="SvUsuario" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="user" name="nombreusu"
                   placeholder="Nombre usuario">
        </div>
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="pass" name="password"
                   placeholder="Password">
        </div>

        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="rol" name="roles"
                   placeholder="Rol">
        </div>
    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Crear Usuario
    </button>
    
</form>


<%@include file="compon/bodyFinal.jsp" %>