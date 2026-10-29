package com.nabil.utilities;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import com.nabil.R;

public class MusicService extends Service implements MediaPlayer.OnErrorListener {

    MediaPlayer f4270r;

    private int f4272t;

    private final IBinder f4269q = new a();

    private int f4271s = 0;

    public class a extends Binder {
        public a() {
        }

        public MusicService a() {
            return MusicService.this;
        }
    }

    public void a() {
        try {
            if (this.f4270r.isPlaying()) {
                this.f4270r.pause();
                this.f4271s = this.f4270r.getCurrentPosition();
            }
        } catch (Exception e8) {
            System.out.println("MusicService class Exception: " + e8);
        }
    }

    public void b() {
        try {
            if (this.f4270r.isPlaying()) {
                return;
            }
            this.f4270r.seekTo(this.f4271s);
            this.f4270r.start();
        } catch (Exception e8) {
            System.out.println("MusicService class Exception: " + e8);
        }
    }

    public void c(int i7) {
        this.f4272t = i7;
        MediaPlayer create = MediaPlayer.create(this, i7);
        this.f4270r = create;
        create.setOnErrorListener(this);
        MediaPlayer mediaPlayer = this.f4270r;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(true);
            if (i7 == R.raw.thewinterlegion) {
                this.f4270r.setVolume(0.17f, 0.17f);
            } else {
                this.f4270r.setVolume(100.0f, 100.0f);
            }
        }
        try {
            this.f4270r.start();
        } catch (Exception e8) {
            System.out.println("MusicService class Exception: " + e8);
        }
    }

    public void d() {
        try {
            MediaPlayer mediaPlayer = this.f4270r;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.f4270r.release();
            }
            this.f4270r = null;
        } catch (Exception e8) {
            System.out.println("MusicService class Exception: " + e8);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f4269q;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f4272t = R.raw.thewinterlegion;
        MediaPlayer create = MediaPlayer.create(this, R.raw.thewinterlegion);
        this.f4270r = create;
        create.setOnErrorListener(this);
        MediaPlayer mediaPlayer = this.f4270r;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(true);
            this.f4270r.setVolume(0.18f, 0.18f);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        try {
            MediaPlayer mediaPlayer = this.f4270r;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.stop();
                    this.f4270r.release();
                } finally {
                    this.f4270r = null;
                }
            }
        } catch (Exception e8) {
            System.out.println("MusicService class Exception: " + e8);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
        MediaPlayer mediaPlayer2 = this.f4270r;
        if (mediaPlayer2 == null) {
            return false;
        }
        try {
            mediaPlayer2.stop();
            this.f4270r.release();
            return false;
        } finally {
            this.f4270r = null;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        try {
            this.f4270r.start();
            return 2;
        } catch (Exception e8) {
            System.out.println("MusicService class Exception: " + e8);
            return 2;
        }
    }
}
