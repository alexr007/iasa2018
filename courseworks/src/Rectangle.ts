import Shape from './Shape'

export default class Rectangle extends Shape {
    constructor(
        public name: string,
        private color: string,        
        private x: number, 
        private y: number, 
        private width: number,
        private height: number, 
    ) {
        super(name);
    }
    
    draw() {
        if (this.isHidden) return;

        const zoomedHeight = this.height * this.scaleMultiplier;
        const zoomedWidth = this.height * this.scaleMultiplier;
        const translatedX = this.x + this.translateX
        const translatedY = this.y + this.translateY

        this.ctx.save()
        this.ctx.beginPath();

        this.ctx.fillStyle = this.color;

        this.ctx.translate(translatedX + zoomedWidth / 2, translatedY + zoomedHeight / 2);

        this.ctx.rotate(this.turnAngleRadians);

        this.ctx.translate(-translatedX - zoomedWidth / 2, -translatedY - zoomedHeight / 2);

        this.ctx.rect(translatedX, translatedY, zoomedWidth, zoomedHeight);
        
        this.ctx.fill();
        this.ctx.restore();
    }
}