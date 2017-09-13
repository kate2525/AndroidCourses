package com.example.kate.di;

//документ настройки
//инициализирует inject. прописываются все классы где вы хотите использов инджект


import com.example.kate.home10.Home10ViewModel;
import com.example.kate.lesson17.UI;
import javax.inject.Singleton;
import dagger.Component;

@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {

    public void inject(Home10ViewModel home10ViewModel);
    public void inject(UI ui);
}
