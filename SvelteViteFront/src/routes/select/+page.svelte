<script>
	import fondo from '$lib/images/fondoLibro.webp';
	import cursor1 from '$lib/images/cursor1img.png';
	import cursor2 from '$lib/images/cursor2img.png';

	import { onMount } from 'svelte';
	let catFact = [];

	onMount(async () => {
		const response = await fetch('/retrieveBooks');
		const data = await response.json();
		catFact = data;
		console.log(catFact);
	});
</script>

<svelte:head>
	<title>Ver datos</title>
	<meta name="description" content="About this app" />	
</svelte:head>

	<div class="letra datos" style="cursor: url({cursor2}), auto">
		{#each catFact as fact}
			<div>
				<div class="bg-white shadow-md rounded-lg p-4 cartas" style="background-image: url({fondo});">
					<div>
						<p>{fact.name}</p>
						<p>~ {fact.author} ~</p>
					</div>
					<p class="precio" style="cursor: url({cursor1}), auto">Precio: {fact.price}€</p>
				</div>
			</div>
		{/each}
	</div>

<style>
	/* global.css */
	@font-face {
		font-family: 'HARRYP';
		src: url('../lib/font/HARRYP__.ttf') format('truetype');
		font-weight: normal;
		font-style: normal;
	}

	.cartas {
		margin: 0 auto;
		margin-top: 50px;
		margin-bottom: 50px;
		font-size: xxx-large;
		background-size: cover;
		background-repeat: no-repeat;
		background-position: center center;
		color: black;
		width: 300px;
		height: 400px;
		text-shadow: 2px 2px 5px white;
		display: flex;
		flex-direction: column; /* Cambia la dirección del flujo a columna */
		justify-content: space-between; /* Distribuye los elementos de manera uniforme en el eje vertical */
	}	

	.letra {
		font-family: 'HARRYP';
		font-size: 30px;
	}

	.datos {
		margin-top: 50px;
		text-align: center;
	}

</style>
