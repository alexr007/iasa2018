export type Directions = "up" | "down" | "right" | "left";

export interface RenderingContext extends CanvasRenderingContext2D {}

export interface DrawInterface {
    initDrawContext(ctx: RenderingContext): void;
    draw(): void;
}

export interface ShapeInterface {
    hide(): void;
    show(): void;
    turnRight(angle: number): void;
    turnLeft(angle: number): void;
    zoomIn(multiplier: number): void;
    zoomOut(multiplier: number): void;
    move(direction: Directions, distance: number): void;
}

export default abstract class Shape implements DrawInterface, ShapeInterface {
    protected ctx!: RenderingContext;

    private _isHidden = false;
    private _turnAngleRadians = 0;
    private _scaleMultiplier = 1;
    private _translateX = 0;
    private _translateY = 0;
    
    constructor(
        public name: string,        
    ) {}

    public initDrawContext(ctx: RenderingContext): void {
        this.ctx = ctx;
    }

    abstract draw(): void;


    public get isHidden(): boolean {
        return this._isHidden;
    }

    public hide(): void {
        this._isHidden = true;
    };

    public show(): void {
        this._isHidden = false;
    };


    public get turnAngleRadians(): number {
        return this._turnAngleRadians;
    }

    public turnRight(angle: number = 10): void {
        this._turnAngleRadians += (Math.PI / 180) * angle;
    }

    public turnLeft(angle: number = -10): void {
        this._turnAngleRadians += (Math.PI / 180) * angle;
    }


    public get scaleMultiplier(): number {
        return this._scaleMultiplier;
    }

    public zoomIn(multiplier: number = 1.1): void {
        this._scaleMultiplier *= multiplier;
    }

    public zoomOut(multiplier: number = 0.9): void {
        this._scaleMultiplier *= multiplier;
    }


    public get translateX(): number {
        return this._translateX;
    }

    public get translateY(): number {
        return this._translateY;
    }

    public move(direction: Directions, distance: number = 10): void {
        switch(direction) {
            case "up":
                this._translateY -= distance;
                break;
            case "down":
                this._translateY += distance;
                break;

            case "right":
                this._translateX += distance;
                break;

            case "left":
                this._translateX -= distance;
                break;
        }
    }
}
