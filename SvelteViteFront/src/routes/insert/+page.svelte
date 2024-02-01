<svelte:head>
	<title>Insertar</title>
	<meta name="description" content="About this app" />	
</svelte:head>

<script>
    import { onMount } from 'svelte';
    import fondo from '$lib/images/fondoLibro.webp';
	import cursor1 from '$lib/images/cursor1img.png';
	import cursor2 from '$lib/images/cursor2img.png';

    let author = '';
    let name = '';
    let price = '';

    function checkSession() {
        // Obtener todas las cookies y buscar la de sesión
        const cookies = document.cookie.split(';');
        const sessionCookie = cookies.find(cookie => cookie.trim().startsWith('session='));

        // Si la cookie de sesión existe, devuelve true
        return sessionCookie !== undefined;
    }

    // Verificar sesión al cargar la página
    onMount(() => {
        if (!checkSession()) {
            // Redirigir o mostrar un mensaje de no autorizado
			alert("No autorizado, requiere iniciar sesión");
            window.location.href = "http://localhost:5173/login";
        }
    });

    async function doPost() {
        // Verificar sesión antes de realizar la acción
        if (!checkSession()) {
            alert("No autorizado, requiere iniciar sesión");
            return;
        }

        await fetch('/createBook', {
            method: 'POST',
            body: JSON.stringify({
                author,
                name,
                price
            }),
            headers: {
                'Content-Type': 'application/json'
            }
        });

        location.reload();
    }
</script>


<div class="container letra" style="cursor: url({cursor2}), auto">

	<h1 style="font-size: 80px;">Inserte los datos para un nuevo libro</h1>
	
	<div class="formulario">
		
			<label for="bookAuthor" style="cursor: url({cursor2}), auto">Autor del libro:</label>
			<input type="text" id="bookAuthor" bind:value={author} style="background-image: url({fondo}); text-align: center; cursor: url({cursor1}), auto"><br>

			<label for="bookName" style="cursor: url({cursor2}), auto">Nombre del libro:</label>
			<input type="text" id="bookName" bind:value={name} style="background-image: url({fondo}); text-align: center;  cursor: url({cursor1}), auto"><br>

			<label for="bookPrice" style="cursor: url({cursor2}), auto">Precio:</label>
			<input type="number" step="0.01" id="bookPrice" bind:value={price} style="background-image: url({fondo}); text-align: center;  cursor: url({cursor1}), auto"><br>

			<button on:click={doPost} style="cursor: url({cursor1}), auto">Crear Libro</button>
		
	</div>
</div>

<style>
	/* global.css */
	@font-face {
		font-family: 'HARRYP';
		src: url('../lib/font/HARRYP__.ttf') format('truetype');
		font-weight: normal;
		font-style: normal;
	}

	.letra {
		font-family: 'HARRYP';
		font-size: 30px;
		color: white;
		text-shadow: 6px 6px 10px #000000;
	}

	label {
		margin-bottom: 5px;
	}

	input {
		margin-bottom: 5px;
		border: 3px solid black;
		border-radius: 5px;
	}

	.formulario {
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
	}

	button {
		margin: 0 auto;
		background-color: #543d0b;
		color: white;
		padding: 10px 20px;
		border: none;
		cursor: pointer;
		margin-bottom: 30px;
		border-radius: 10px;
		
	}

	button:hover {
		background-color: #085080;
	}

</style>