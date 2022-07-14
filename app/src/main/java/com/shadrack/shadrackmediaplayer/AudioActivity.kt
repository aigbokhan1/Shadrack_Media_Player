package com.shadrack.shadrackmediaplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class AudioActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var runnable: Runnable
    private var handler: Handler = Handler()
    private var pause: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio)

   /*     playBtn.setOnClickListener {
            if (pause) {
                mediaPlayer.seekTo(mediaPlayer.currentPosition)
                mediaPlayer.start()
                pause = false
                Toast.makeText(this, "media playing", Toast.LENGTH_SHORT).show()

            } else {
                mediaPlayer =
                    MediaPlayer.create(applicationContext, R.raw.esther_oji_ministers_iwoloba)
                mediaPlayer.start()
                Toast.makeText(this, "media playing", Toast.LENGTH_SHORT).show()
            }
            initializeSeekBar()
            playBtn.isEnabled = false
            pauseBtn.isEnabled = true
            stopBtn.isEnabled = true

            mediaPlayer.setOnCompletionListener {
                playBtn.isEnabled = true
                pauseBtn.isEnabled = false
                stopBtn.isEnabled = false
                Toast.makeText(this, "media ended", Toast.LENGTH_SHORT).show()
            }
        }

        pauseBtn.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
                pause = true
                playBtn.isEnabled = true
                pauseBtn.isEnabled = false
                stopBtn.isEnabled = true
                Toast.makeText(this, "media paused", Toast.LENGTH_SHORT).show()
            }
        }
        stopBtn.setOnClickListener {
            if (mediaPlayer.isPlaying || pause.equals(true)) {
                pause = false
                seek_bar.setProgress(0)
                mediaPlayer.stop()
                mediaPlayer.reset()
                mediaPlayer.release()
                handler.removeCallbacks(runnable)

                playBtn.isEnabled = true
                pauseBtn.isEnabled = false
                stopBtn.isEnabled = false
                tv_pass.text = ""
                tv_pass.text = ""
                Toast.makeText(this, "media stopped", Toast.LENGTH_SHORT).show()
            }

        }
        seek_bar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                if (b) {
                    mediaPlayer.seekTo(i * 1000)
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        }) */
    }


  /*  private fun initializeSeekBar() {
        seek_bar.max = mediaPlayer.seconds
        runnable = Runnable {
            seek_bar.progress = mediaPlayer.currentSeconds
            tv_pass.text = "${mediaPlayer.currentSeconds}sec"
            val diff = mediaPlayer.seconds - mediaPlayer.currentSeconds
            tv_due.text = "$diff sec"
            handler.postDelayed(runnable, 3000)
        }
        handler.postDelayed(runnable, 1000)
    } */
}

/*val MediaPlayer.seconds: Int
    get() {
        return this.duration / 1000
    }

val MediaPlayer.currentSeconds: Int
    get() {
        return this.currentPosition / 1000
    }

val MediaPlayer.time: Int
    get() {
        return this.duration / 1000
    }*/
