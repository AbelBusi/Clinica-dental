<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="compon/header.jsp" %>
<%@include file="compon/bodyPrimeraParte.jsp" %>

<h1>Lista de usuarios registrados en la clinica</h1>

<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
    <p class="mb-4">A continuacion se mostraran los usuarios registados en la pagina web</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>Nombre</th>
                            <th>rol</th>
                            <th style="width: 210px" >Accion </th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>id</th>
                            <th>Nombre de usuario</th>
                            <th>rol</th>
                            <th style="width: 210px" >Accion </th>
                        </tr>
                    </tfoot>
                    <%
                        List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");

                    %>


                    <tbody>
                        <% for (Usuario usu : listaUsuarios) {%>
                        <tr>
                            <th><%=usu.getId_usuario()%></th>
                            <th><%=usu.getUsuario()%></th>
                            <th><%=usu.getRol()%></th>

                            <td style="display: flex; width: 230px;">
                                <form name="eliminar" action="SvElimUsuario" method="POST">

                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: red;margin-right: 5px;">
                                        <i class="fas fa-trash-alt">Eliminar</i>    
                                    </button>
                                    <input type="hidden" name="id" value="<%=usu.getId_usuario()%>">
                                </form>
                                <form name="editar" action="SvEditUser" method="GET">

                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: blue;margin-right: 5px;">
                                        <i class="fas fa-pencil-alt">Editar</i>    
                                    </button>
                                    <input type="hidden" name="id" value="<%=usu.getId_usuario()%>">
                                </form>



                            </td>

                        </tr>
                        <%}%>

                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<%@include file="compon/bodyFinal.jsp" %>
