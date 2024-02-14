<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="compon/header.jsp"%>
<%@include file="compon/bodyPrimeraParte.jsp"%>

<h1>Registro de responsables</h1>
<p>En esta seccion se agregaran a todos los responsables y encargados de un paciente</p>
<form class="user" action="SvAgregarResponsable" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre" name="nombre"
                   placeholder="Nombre ">
        </div>
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="apellido" name="apellido"
                   placeholder="Apellido">
        </div>

        <div class="col-sm-6 mb-3">
            <input type="number" maxlength="8" class="form-control form-control-user" id="dni" name="dni"
                   placeholder="Dni">
        </div>

        <div class="col-sm-6 mb-3">
            <input type="text" maxlength="8" class="form-control form-control-user" id="sexo" name="sexo"
                   placeholder="Sexo">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="date" class="form-control form-control-user" id="Nacimiento" name="fecha_naci"
                   placeholder="Fecha Nacimiento">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" maxlength="8" class="form-control form-control-user" id="respon" name="responsabilidad"
                   placeholder="tipo de responsabilidad">
        </div>

    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Crear Usuario
    </button>

</form>


<%@include file="compon/bodyFinal.jsp" %>
