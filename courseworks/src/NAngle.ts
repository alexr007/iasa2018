import Shape from './Shape'

type Coordinate = [number, number];

export default class NAngle extends Shape {
    constructor(
        public name: string,
        private color: string,        
        private coordinates: Coordinate[],
    ) {
        super(name);
    }
    
    private getCenterOfShape(): Coordinate {
        var pts = [...this.coordinates]
        var first = pts[0]
        var last = pts[pts.length-1];
        
        if (first[0] !== last[0] || first[1] !== last[1]) {
            pts.push(first);
        }
        
        var twicearea=0;
        var x=0;
        var y=0;
        
        var nPts = pts.length;
        
        var p1;
        var p2;
        var f;
        
        for (var i = 0, j = nPts - 1; i < nPts; j = i++) {
            p1 = pts[i]; 
            p2 = pts[j];

            f = p1[0] * p2[1] - p2[0] * p1[1];

            twicearea += f;          

            x += (p1[0] + p2[0]) * f;
            y += (p1[1] + p2[1]) * f;
        }

        f = twicearea * 3;

        return [x/f, y/f];
    }
    
    draw() {
        if (this.isHidden) return;
        
        this.ctx.save()
        this.ctx.beginPath();
        
        this.ctx.fillStyle = this.color;    

        const centerOfShape = this.getCenterOfShape();

        this.ctx.translate(centerOfShape[0], centerOfShape[0]);
        
        this.ctx.rotate(this.turnAngleRadians);

        this.ctx.translate(-centerOfShape[0], -centerOfShape[0]);
        
        
        this.ctx.moveTo(
            (this.coordinates[0][0] + this.translateX) * this.scaleMultiplier, 
            (this.coordinates[0][1] + this.translateY) * this.scaleMultiplier
        ); // first coordinate
        
        
        for (let i = 1; i < this.coordinates.length; i++) {
            this.ctx.lineTo(
                (this.coordinates[i][0] + this.translateX) * this.scaleMultiplier, 
                (this.coordinates[i][1] + this.translateY) * this.scaleMultiplier
            )
        }
        
        this.ctx.closePath();
        this.ctx.fill();
        this.ctx.restore();
    }
}