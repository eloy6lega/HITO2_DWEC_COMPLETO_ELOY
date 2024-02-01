<script>
	import fondo from '$lib/images/fondoLibro.webp';
	import cursor1 from '$lib/images/cursor1img.png';
	import cursor2 from '$lib/images/cursor2img.png';

	import { onMount } from 'svelte';

	function checkSession() {
        // Obtener todas las cookies y buscar la de sesión
        const cookies = document.cookie.split(';');
        const sessionCookie = cookies.find(cookie => cookie.trim().startsWith('session='));

        // Si la cookie de sesión existe, devuelve true
        return sessionCookie !== undefined;
    }

    function getUsernameFromCookie() {
        const cookies = document.cookie.split(';');
        const sessionCookie = cookies.find(cookie => cookie.trim().startsWith('session='));

        if (sessionCookie) {
            const username = sessionCookie.split('=')[1].trim();
            return username;
        }

        return null;
    }

    // Verificar sesión al cargar la página
    onMount(() => {
        if (!checkSession() || getUsernameFromCookie() !== 'admin') {
			alert("Necesita rol de administrador para esta función");
            // Redirigir o mostrar un mensaje de no autorizado
            window.location.href = "http://localhost:5173/";
        }
    });

	let catFact = [];

	onMount(async () => {
		const response = await fetch('/retrieveBooks');
		const data = await response.json();
		catFact = data;
		console.log(catFact);
	});

	async function doDelete (id) {
		console.log(id);
		await fetch(`/deleteBook/${id}`, {
			method: 'DELETE',
			
			headers: {
				'Content-Type': 'application/json'
			}
		})
		
		// recarga la página completa
		location.reload();
	}

	async function doUpdate (id) {
		// console.log(id);
		console.log('Función NO disponible por el momento');
		alert('Función NO disponible por el momento');
		// await fetch(`/updateBook`, {
		// 	method: 'POST',
			
		// 	headers: {
		// 		'Content-Type': 'application/json'
		// 	}
		// })
		
		// recarga la página completa
		// location.reload();
	}
</script>

<svelte:head>
	<title>Ver datos</title>
	<meta name="description" content="About this app" />	
</svelte:head>

<section style="cursor: url({cursor2}), auto; width: 100%; height: 100%;">
	<div class="container">
		<h2 class="letra1">Panel de Administrador</h2>
		<div class="row letra datos">
			{#each catFact as fact}
				<div class="col-md-4">
					<div class="card" style="background-image: url({fondo});">
						<div class="card-body">
							<h5 class="card-text">{fact.name}</h5>
							<h6 class="card-text">~ {fact.author} ~</h6>
							<p class="card-text">Precio: {fact.price}</p>
							<p class="card-text">Id: {fact.id}</p>

							<div>
								<button class="boton" on:click={()=>doUpdate(fact.id)} style="cursor: url({cursor1}), auto;">
									<img src="https://cdn-icons-png.flaticon.com/512/3094/3094025.png" alt="imagen" width="30px" height="30px">
								</button>
								<button class="boton" on:click={()=>doDelete(fact.id)} style="cursor: url({cursor1}), auto;">
									<img src="https://cdn-icons-png.flaticon.com/512/58/58326.png" alt="imagen" width="30px" height="30px">
								</button>
							</div>		
							
						</div>
					</div>
				</div>
			{/each}
		</div>
	</div>
</section>

<style>

	/* global.css */
	@font-face {
		font-family: 'HARRYP';
		src: url('../lib/font/HARRYP__.ttf') format('truetype');
		font-weight: normal;
		font-style: normal;
	}

	.card{
		
		margin: 0 auto;
		border: 1px solid rgb(0, 0, 0);
		border-radius: 10px;
		margin-top: 20px;
		margin-bottom: 20px;
		width: 350px;
		height: 420px;
		text-shadow: 2px 2px 5px white;
	}

	.letra1{
		font-family: 'HARRYP';
		font-size: 30px;
		color: white;
		text-align: center;
		font-size: 80px;
		margin-top: -30px;
	}

	.letra{
		font-family: 'HARRYP';
		font-size: 40px;
	}

	.datos{
		margin-top: 50px;
		text-align: center;
	}

	.boton{
		background-color: transparent;
		border: none;
	}

</style>
