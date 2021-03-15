import React, { Component } from 'react'
import { render } from 'react-dom'

import Shape, { Directions } from './Shape'
import Renderer from './Renderer'


class Toolbox extends Component<{ shapes: Shape[] }, { selectedShapeIndex: number }> {
    state = {
        selectedShapeIndex: 0,
    }

    selectShape = (event: React.ChangeEvent<HTMLSelectElement> ): void => {
        this.setState({ selectedShapeIndex: +event.target.value })
    }

    move(direction: Directions): void {
        this.props.shapes[this.state.selectedShapeIndex].move(direction);
    }

    hide(): void {
        this.props.shapes[this.state.selectedShapeIndex].hide();
    }

    show(): void {
        this.props.shapes[this.state.selectedShapeIndex].show();
    }

    turnRight(): void {
        this.props.shapes[this.state.selectedShapeIndex].turnRight();
    }
    
    turnLeft(): void {
        this.props.shapes[this.state.selectedShapeIndex].turnLeft();
    }

    zoomIn(): void {
        this.props.shapes[this.state.selectedShapeIndex].zoomIn();
    }
    
    zoomOut(): void {
        this.props.shapes[this.state.selectedShapeIndex].zoomOut();
    }

    render() {
        const { shapes } = this.props;

        return (
            <div>
                <select onChange={this.selectShape}>
                    {shapes.map((shape, index) => (
                        <option key={index} value={index}>{shape.name}</option>
                    ))}
                </select>

                <div>
                    <button onClick={() => this.move('up')}>MoveUp</button>
                    <button onClick={() => this.move('down')}>MoveDown</button>
                    <button onClick={() => this.move('left')}>MoveLeft</button>
                    <button onClick={() => this.move('right')}>MoveRight</button>
                </div>
                <div>
                    <button onClick={() => this.hide()}>Hide</button>
                    <button onClick={() => this.show()}>Show</button>
                </div>

                <div>
                    <button onClick={() => this.turnLeft()}>TurnLeft</button>
                    <button onClick={() => this.turnRight()}>TurnRight</button>
                </div>

                <div>
                    <button onClick={() => this.zoomIn()}>ZoomIn</button>
                    <button onClick={() => this.zoomOut()}>ZoomOut</button>
                </div>
            </div>
        );
    }
}


export const init = (container: HTMLElement, renderer: Renderer) => {
    render(<Toolbox shapes={renderer.shapes} />, container);
}