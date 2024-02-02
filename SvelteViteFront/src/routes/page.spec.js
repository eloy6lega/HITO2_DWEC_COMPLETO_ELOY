import { describe, expect, it, beforeEach, afterEach } from 'vitest';
import Page from "./+page.svelte";

describe("Page", () => {
    let instance = null;

    beforeEach(() => {
        // Create instance of the component and mount it
        instance = new Page();
        instance.$$.fragment.c();
    });

    afterEach(() => {
        // Destroy/unmount instance
        instance.$destroy();
    });

    it("El componente page se renderiza correctamente", () => {
        expect(instance).toBeDefined();
    });
});
