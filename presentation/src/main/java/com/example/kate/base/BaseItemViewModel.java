package com.example.kate.base;


public abstract class BaseItemViewModel<Model> implements BaceViewModel {

    protected abstract void setItem(Model item, int position);

    @Override
    public void init() {
    }

    @Override
    public void release() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void pause() {
    }
}
