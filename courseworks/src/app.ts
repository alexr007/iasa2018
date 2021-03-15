import Renderer from './Renderer'
import Toolbox from './Toolbox'

// import ShapesFactory from './ShapesFactory'
import Circle from './Circle'
import Rectangle from './Rectangle'
import NAngle from './NAngle'


const canvasElem = <HTMLCanvasElement>document.getElementById('canvas');
const toolboxElem = <HTMLElement>document.getElementById('toolbox-container');

// ShapesFactory.registerShape('circle', Circle);

const circle = new Circle('Red circle','red', 0, 0, 100);
const rect = new Rectangle('Blue rectangle', 'blue', 0, 0, 100, 100);
const triangle = new NAngle('Green triangle', 'green', [[50, 50], [50, 100], [100, 100]]);

const renderer = new Renderer(1280, 720, canvasElem);
renderer.addShapes([circle, rect, triangle]);

const toolbox = new Toolbox(toolboxElem, renderer);
toolbox.init();

renderer.render();

