package com.example.kate.lesson17;


import com.example.kate.main.ExampleApplication;

import javax.inject.Inject;

public class UI {

    //создадутся за нас связи с помощью аннотации.new сделает дайгер
    @Inject
    UseCase1 useCase1;

    public UI() {
        ExampleApplication.appComponent.inject(this);
    }

    public void method() {

        useCase1.testUseCase1();
    }
}
