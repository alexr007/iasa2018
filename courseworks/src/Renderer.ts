import Shape from './Shape'

export default class Renderer {
    private ctx: CanvasRenderingContext2D;
    private _shapes: Shape[] = [];
    
    constructor(
        private width: number,
        private height: number,
        private canvasElem: HTMLCanvasElement, 
    ) {
        canvasElem.width = width;
        canvasElem.height = height;

        this.ctx = <CanvasRenderingContext2D>canvasElem.getContext('2d');
        this.render = this.render.bind(this);
    }

    public get shapes() {
        return this._shapes;
    }

    public addShapes(shapesArray: Shape[]) {
        this._shapes = shapesArray;
        
        this._shapes.forEach((shape) => {
            shape.initDrawContext(this.ctx);
        });
    }
    
    public render() {
        this.ctx.fillStyle = "#000";
        this.ctx.fillRect(0, 0, this.width, this.height);
        
        this._shapes.forEach((shape) => {
            shape.draw();
        });
        
        requestAnimationFrame(this.render); 
    }
}