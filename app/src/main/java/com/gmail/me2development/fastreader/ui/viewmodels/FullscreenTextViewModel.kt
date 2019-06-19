package com.gmail.me2development.fastreader.ui.viewmodels

import androidx.databinding.ObservableBoolean
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gmail.me2development.fastreader.ui.model.LargeText.wordList
import kotlinx.coroutines.*


class FullscreenTextViewModel: ViewModel(), CoroutineScope {

    //Variables for using Coroutines
    private var job: Job? = null
    override val coroutineContext = Dispatchers.Main


    //When it changes, update screen
    var textToShow= MutableLiveData<String>()

    var index=0

    val isPaused=ObservableBoolean(false)

    fun changePauseState(){
        if(isPaused.get()){
            restartIteration()
        }else{
            stopIterating()
        }
        isPaused.set(!isPaused.get())
    }

    fun back(){
        if(index-5>-1){//If it doesnt get negative
            index-=5
            if(!isPaused.get()){
                restartIteration()
            }else{
                textToShow.postValue(wordList[index])//Update even though paused
            }
        }
    }

    fun forward(){
        if(index+5<wordList.size){
            index+=5
            if(!isPaused.get()){
                restartIteration()
            }else{
                textToShow.postValue(wordList[index])//Update even though paused
            }
        }
    }


    private fun restartIteration(){
        stopIterating()
        startIterating()
    }

    //Cancel random rating/shuffling
    private fun stopIterating() = job?.cancel()

    //Start cancelable job for rating/shuffling
    fun startIterating() {
        job = launch {
            while (index<=wordList.lastIndex) {
                    delay(250)
                    textToShow.postValue(wordList[index])
                    index+=1
            }
        }
    }


}

