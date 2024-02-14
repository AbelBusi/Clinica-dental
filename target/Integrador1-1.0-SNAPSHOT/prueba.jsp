<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="compon/header.jsp"%>
<%@include file="compon/bodyPrimeraParte.jsp"%>

<<h1>Prueba tecnica</h1>

<form class="user">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="dni"
                   placeholder="Dni">
        </div>
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="nombre"
                   placeholder="Nombre">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="apellido"
                   placeholder="Apellido">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="telefono"
                   placeholder="Telefono">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="direccion"
                   placeholder="Direccion">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="fecha"
                   placeholder="Fecha Nacimiento">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="especialidad"
                   placeholder="Especialidad">
        </div>
    </div>
    <a href="login.html" class="btn btn-primary btn-user btn-block">
        Register Account
    </a>
    <hr>
    <a href="index.html" class="btn btn-google btn-user btn-block">
        <i class="fab fa-google fa-fw"></i> Register with Google
    </a>
    <a href="index.html" class="btn btn-facebook btn-user btn-block">
        <i class="fab fa-facebook-f fa-fw"></i> Register with Facebook
    </a>
</form>



<%@include file="compon/bodyFinal.jsp"%>