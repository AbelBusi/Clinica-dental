<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="compon/header.jsp"%>
<%@include file="compon/bodyPrimeraParte.jsp"%>

<h1>Registro de pacientes</h1>
<p>Este es un formulario para llenar los datos del paciente</p>
<form class="user" action="SvAgregarResponsable" method="POST">
    <div class="form-group col">

        <div class="col-sm-6 mb-3">
            <input type="text" maxlength="8" class="form-control form-control-user" id="dni" name="dni"
                   placeholder="Dni">
        </div>

        <div class="col-sm-6 mb-3">
            <input type="text" maxlength="30" class="form-control form-control-user" id="user" name="nombreusu"
                   placeholder="Nombre">
        </div>
        <div class="col-sm-6 mb-3 ">

            <input type="text" class="form-control form-control-user" id="apellidos" name="apellido"
                   placeholder="Apellidos">
        </div>

        <div class="col-sm-6 mb-3">
            <input type="date" class="form-control form-control-user" id="nacimiento" name="fecha_naci"
                   placeholder="Fecha Nacimiento">
        </div>

        <div class="col-sm-6 mb-3">
            <input type="text" maxlength="10" class="form-control form-control-user" id="sexo" name="sexo"
                   placeholder="Sexo">
        </div>

        <div class="col-sm-6 mb-3">
            <input type="number" maxlength="3" class="form-control form-control-user" id="sangre_tipo" name="tipoSangre"
                   placeholder="Tipo de sangre">
        </div>

        <div class="col-sm-6 mb-3">
            <input type="text" maxlength="8" class="form-control form-control-user" id="razon_social" name="razonSocial"
                   placeholder="Razon social">
        </div>

        <form name="editar" action="SvAgregarResponsable" method="GET">

            <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color:lightgreen;margin-right: 5px;">
                <i class="fas fa-pencil-alt">Agregar responsable del paciente</i>    
            </button>

        </form>

    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Guardar paciente
    </button>

</form>


<%@include file="compon/bodyFinal.jsp" %>
