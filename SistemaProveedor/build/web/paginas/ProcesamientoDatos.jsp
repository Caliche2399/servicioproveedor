<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    int nitPaciente = Integer.parseInt(request.getParameter("nitPaciente"));
    int codigoPaciente = Integer.parseInt(request.getParameter("codigoPaciente"));;
    String fechaNacimiento = request.getParameter("fechaN");
    String fechaIC =request.getParameter("fechaIC");
    
    desarrolloweb.webservice.Consulta servicio = new desarrolloweb.webservice.Consulta();
    desarrolloweb.webservice.ConsultaSoap post = servicio.getConsultaSoap();
    
    String resultado = post.consultaProveedor(nitPaciente, codigoPaciente, fechaNacimiento, fechaIC);
    
    if(resultado.isEmpty()){
        resultado = "Sin Cobertura";
    }
    
    out.println("Resultado Consulta: "+resultado);

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema Consulta Proveedores</title>
        <link type="text/css" rel="stylesheet" href="../estilos/estilo.css"/>>
    </head>
    <body>
        <div class="formResultado">
            <div class="title">
                <%
                    out.println(resultado);
                %>
            </div>
        </div>
    </body>
</html>
