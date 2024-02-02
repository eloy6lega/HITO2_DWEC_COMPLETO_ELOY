import { sveltekit } from '@sveltejs/kit/vite';
import { defineConfig } from 'vite';
// import { svelte } from "@sveltejs/vite-plugin-svelte";

export default defineConfig({
	plugins: [sveltekit()],
	// test: {
	// 	globals: true,
	//   },
	server: {
		proxy: {
			// IP de casa
			// '/retrieveBooks': 'http://192.168.1.42:8080/',
			// '/createBook': 'http://192.168.1.42:8080/',
			// '/deleteBook': 'http://192.168.1.42:8080/',
			// '/updateBook': 'http://192.168.1.42:8080/'

			// IP de clase
			'/retrieveBooks': 'http://172.16.0.230:8080/',
			'/createBook': 'http://172.16.0.230:8080/',
			'/deleteBook': 'http://172.16.0.230:8080/',
			'/updateBook': 'http://172.16.0.230:8080/'
		},
	},
});
