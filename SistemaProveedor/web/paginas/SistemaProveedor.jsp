<%-- 
    Document   : SistemaProveedor
    Created on : Nov 2, 2022, 10:06:17 AM
    Author     : CAR4173AT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema Consulta Proveedores</title>
        <link type="text/css" rel="stylesheet" href="../estilos/estilo.css"/>>
    </head>
    <body>
        <%--
        <div class="form">
            <div class="title">Consulta Proveedor</div>
            <div class="input-container ic1">
                <input id="nitPaciente" class="input" type="text" placeholder=" " />
                <div class="cut"></div>
                <label for="nitPaciente" class="placeholder">Nit</label>
            </div>
            <div class="input-container ic2">
              <input id="codigoPaciente" class="input" type="text" placeholder=" " />
              <div class="cut"></div>
              <label for="codigoPaciente" class="placeholder">Código Paciente</label>
            </div>
            <div class="input-container ic2">
              <input id="fechaN" class="input" type="text" placeholder=" " />
              <div class="cut cut-short"></div>
              <label for="fechaN" class="placeholder">Fecha Nacimiento</>
            </div>
            <div class="input-container ic2">
              <input id="fechaIC" class="input" type="text" placeholder=" " />
              <div class="cut cut-short"></div>
              <label for="fechaIC" class="placeholder">Fecha IC</>
            </div>
            <button type="submit" class="submit">Consultar</button>
        </div>
        --%>

        
        <form class ="form" action="ProcesamientoDatos.jsp" method="post">
            
            <div class="title">Consulta Proveedor</div>
            
            <div class="input-container ic1">
                <input type="text" name="nitPaciente" class="input">
                <div class="cut"></div>
                <label for="nitPaciente" class="placeholder">Nit</label>
            </div>
            <div class="input-container ic1">
                <input type="text" name="codigoPaciente" class="input">
                <div class="cut"></div>
                <label for="codigoPaciente" class="placeholder">Código Paciente</label>
            </div>
            <div class="input-container ic1">
                <input type="text" name="fechaN" class="input">
                <div class="cut"></div>
                <label for="fechaN" class="placeholder">Fecha Nacimiento</label>
            </div>
            <div class="input-container ic1">
                <input type="text" name="fechaIC" class="input">
                <div class="cut"></div>
                <label for="fechaIC" class="placeholder">Fecha IC</label>
            </div>

            <input class="submit" type="submit" value="Consultar Paciente">
        </form>
    </body>
</html>

