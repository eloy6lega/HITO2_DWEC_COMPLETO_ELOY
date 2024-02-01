<script>
	import Header from './Header.svelte';
	import './styles.css';
</script>

<div class="app">
	<Header />	

	<main>
		<slot />
	</main>

	<!-- <footer class="letra" style="margin-top: -50px; font-size: 20px">
		<p>Hito realizado para <strong>Desarrollo Web Entorno Cliente</strong> con <strong>Svelte</strong>, <strong>IntelliJ</strong> y <strong>MySQL</strong></p>
		Por Eloy Pérez Gómez
	</footer> -->
</div>

<style>
	.app {
		display: flex;
		flex-direction: column;
		min-height: 100vh;
	}

	main {
		flex: 1;
		display: flex;
		flex-direction: column;
		padding: 1rem;
		width: 100%;
		max-width: 64rem;
		margin: 0 auto;
		box-sizing: border-box;
	}

	footer {
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		padding: 12px;
	}

	@media (min-width: 480px) {
		footer {
			padding: 12px 0;
		}
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
</style>
