import Shape from './Shape'

export default class Circle extends Shape {    
    constructor(
        public name: string,
        private color: string, 
        private centerX: number, 
        private centerY: number, 
        private radius: number,
    ) {
        super(name);
    }
    
    draw() {
        if (this.isHidden) return;

        const zoomedRadius = this.radius * this.scaleMultiplier
        const translatedX = this.centerX + this.translateX
        const translatedY = this.centerY + this.translateY
        
        this.ctx.save();
        this.ctx.beginPath();

        this.ctx.fillStyle = this.color;

        this.ctx.translate(translatedX + zoomedRadius, translatedY + zoomedRadius);

        this.ctx.rotate(this.turnAngleRadians);

        this.ctx.translate(-translatedX - zoomedRadius, -translatedY - zoomedRadius);

        this.ctx.arc(translatedX + zoomedRadius, translatedY + zoomedRadius, zoomedRadius, 0, 2 * Math.PI);

        this.ctx.fill();
        this.ctx.restore();
    }
}