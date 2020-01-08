package com.testpre.tutorialjetpack.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.testpre.tutorialjetpack.model.DogBreed

class ListViewModel : ViewModel(){

    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()


    fun refresh(){
        val dog1 = DogBreed("1","Corgi","15 years", "breedGroup", "bredFor", "temp", "")
        val dog2 = DogBreed("2","Labrador","20 years", "breedGroup", "bredFor", "temp", "")
        val dog3 = DogBreed("3","Rotwailer","30 years", "breedGroup", "bredFor", "temp", "")
        val dogList = arrayListOf(dog1,dog2,dog3)

        dogs.value = dogList
        dogsLoadError.value = false
        loading.value = false
    }
}