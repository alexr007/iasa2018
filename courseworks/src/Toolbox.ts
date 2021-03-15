import Renderer from './Renderer';

import { init } from './reactToolbox';

export default class Toolbox {
    constructor(
        private container: HTMLElement,
        private renderer: Renderer,
    ) {}

    public init() {
        init(this.container, this.renderer);
    }
}