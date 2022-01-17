package com.practice.rxkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Observable
import io.reactivex.observers.DisposableObserver
import com.practice.rxkotlin.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //viewBinding

        val source = Observable.create<String>{it->
            it.onNext("Hello RxAndroid World")
            it.onComplete()
        }
        source.subscribe(observer)
    }
    var observer = object : DisposableObserver<String>(){
        override fun onComplete() {
            Log.e("TEST","observerComplete")
        }

        override fun onNext(t: String) {
            binding.tvMain.text =t;
        }

        override fun onError(e: Throwable) {
            TODO("Not yet implemented")
        }
    }
}