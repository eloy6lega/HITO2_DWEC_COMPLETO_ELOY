<script>
	import fondo from '$lib/images/fondoLibro.webp';
	import cursor1 from '$lib/images/cursor1img.png';
	import cursor2 from '$lib/images/cursor2img.png';
</script>

<svelte:head>
	<title>Sobre Nosotros</title>
	<meta name="description" content="About this app" />	
</svelte:head>

<div class="container letra" style="cursor: url({cursor1}), auto;">
	<div class="letra datos">
		<div class="seccion">
			<div class="bg-white shadow-md rounded-lg p-4 cartas" style="background-image: url({fondo});">
				<div class="">
					<br>
					<p class="titulo">BIENVENIDOS A LA BIBLIOTECA DE HARRY POTTER</p>
					<div class="lema" style="cursor: url({cursor2}), auto;">
						<p>Somos un grupo de entusiastas de los libros de Harry Potter.</p><br>
						<p>Aquí encontrarás una amplia colección de libros relacionados con el mundo mágico de Harry Potter, desde los clásicos siete libros de la serie principal hasta libros complementarios, guías y mucho más.</p><br>
						<p style="font-size: 40px;">Únete y sumérgete en el maravilloso mundo de Harry Potter</p>
					</div>
					
					<!-- <h4 class="subtitulo">Únete a nuestra comunidad y sumérgete en el maravilloso mundo de Harry Potter</h4> -->
				</div>
				
			</div>
			
		</div>
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

	.letra{
		font-family: 'HARRYP';
		font-size: 30px;
		color: white;
	}

	.seccion {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		flex: 0.6;
		text-align: center;
		color: white;
		text-shadow: 2px 2px 5px #000000;
	}

	.cartas{
		margin: 0 auto;
		margin-top: 50px;
		width: 600px;
		height:840px;
		border-radius: 20px;
	}

	.titulo{
		text-align: center;
		font-size: 50px;
		text-decoration: underline;
	}

	.subtitulo{
		text-align: center;
		font-size: 40px;
	}

	.lema{
		font-size: 30px;
		padding: 15px;
		margin: 50px;
		text-align: justify;
	}

</style>
