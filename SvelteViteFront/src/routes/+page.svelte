<svelte:head>
	<title>Biblioteca Mágica</title>
	<meta name="description" content="Explora nuestra increíble colección de libros mágicos" />
</svelte:head>

<script>
	import fondo from '$lib/images/fondoLibro.webp';
	import cursor1 from '$lib/images/cursor1img.png';
	import cursor2 from '$lib/images/cursor2img.png';
	
	// let isCursor1 = true;

	// function cambiarCursor() {
	// 	isCursor1 = false;
	// }

	// function restaurarCursor() {
	// 	isCursor1 = true;
	// }
</script>

<style>

	/* .cursor1 {
		cursor: url('$lib/images/cursor1img.png'), auto;
	}

	.cursor2 {
		cursor: url('$lib/images/cursor2img.png'), auto;
	} */

	section {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		flex: 0.6;
		text-align: center;
		color: white;
		text-shadow: 2px 2px 5px #000000;
		margin-top: -40px;
		font-size: 60px;
		background-image: url({fondo});
	}

	/* global.css */
	@font-face {
		font-family: 'HARRYP';
		src: url('../lib/font/HARRYP__.ttf') format('truetype');
		font-weight: normal;
		font-style: normal;
	}

	.letra{
		font-family: 'HARRYP';
	}

	.cartas{
		margin: 0 auto;
		margin-top: 50px;
		width: 600px;
		height: 800px;
		border-radius: 20px;
	}

	.titu{
		font-size: 80px;
	}

	.lema{
		font-size: 40px;
	}

	.spam{
		font-size: 30px;
		margin-top: 440px;
	}

</style>
<!-- style="margin-top:-40px; font-size: 60px;" -->

<!-- <section
	role="button"
	tabindex="0"
	on:mouseenter={cambiarCursor}
	on:mouseleave={restaurarCursor}
	class:cursor1={isCursor1}
	class:cursor2={!isCursor1}
> -->
<section style="width: 100%; height: 100%; cursor: url({cursor2}), auto">
	<div class="letra datos">
		<div>
			<div class="bg-white shadow-md rounded-lg p-4 cartas" style="background-image: url({fondo})">
				<div>
					<br>
					<p class="titu">La Biblioteca Mágica</p>
					<p class="lema" style="cursor: url({cursor1}), auto">~ El secreto está en las páginas ~</p>
				</div>
				<p class="spam" style="cursor: url({cursor1}), auto">Hito realizado por ELOY PÉREZ</p>
			</div>
		</div>
	</div>
</section>