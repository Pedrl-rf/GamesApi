$("document").ready(function(){
    $("#contactanos").validate({
        rules:{
            nombre: {
                required: true,
                minlength: 8,
            },
            email: {
                required: true,
            },
            mensaje: {
                required: true,
                minlength: 20,
                maxlength: 300
            }
        },
        messages:
        {
            nombre: {
                required: "Tu Nombre y Apellidos son Importantes",
                minlength: "Tu Nombre es demasiado corto",
            },
            email: {
                required: "Por Favor, introduzca una dirección de correo",
            },
            mensaje: {
                required: "Escribe un mensaje",
                minlength: "Tu Mensaje es demasiado corto",
                maxlength: "Tu Mensaje supera los 300 caracteres"
            }
        },
        submitHandler: function(form) {
            /*form.action = "contacto.php";
            form.submit();
            alert("OK");*/
            var datos = $(form).serialize(); // los datos del formulario
            console.log(datos);
            $.ajax({
                type: "POST",
                url: "contacto.php",
                data: datos
            });
        }

    });
})