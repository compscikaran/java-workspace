package com.design.patterns.behavioral.state;

import com.design.patterns.behavioral.state.concrete.FanHighState;
import com.design.patterns.behavioral.state.concrete.FanLowState;
import com.design.patterns.behavioral.state.concrete.FanMediumState;
import com.design.patterns.behavioral.state.concrete.FanOffState;

public class Fan {

    State fanOffState;
    State fanLowState;
    State fanMedState;
    State fanHighState;

    State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMediumState(this);
        fanHighState = new FanHighState(this);
        this.state = fanOffState;
    }

    public void pullChain() {
        this.state.handleRequest();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanHighState() {
        return fanHighState;
    }
}
