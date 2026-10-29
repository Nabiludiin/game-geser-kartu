package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class en0 extends gn0 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map J;
    private int A;
    private int B;
    private int C;
    private zn0 D;
    private final boolean E;
    private int F;
    private fn0 G;
    private boolean H;
    private Integer I;

    /* renamed from: s, reason: collision with root package name */
    private final bo0 f7713s;

    /* renamed from: t, reason: collision with root package name */
    private final co0 f7714t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f7715u;

    /* renamed from: v, reason: collision with root package name */
    private final rx1 f7716v;

    /* renamed from: w, reason: collision with root package name */
    private int f7717w;

    /* renamed from: x, reason: collision with root package name */
    private int f7718x;

    /* renamed from: y, reason: collision with root package name */
    private MediaPlayer f7719y;

    /* renamed from: z, reason: collision with root package name */
    private Uri f7720z;

    static {
        HashMap hashMap = new HashMap();
        J = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public en0(Context context, bo0 bo0Var, boolean z7, boolean z8, ao0 ao0Var, co0 co0Var, rx1 rx1Var) {
        super(context);
        this.f7717w = 0;
        this.f7718x = 0;
        this.H = false;
        this.I = null;
        this.f7713s = bo0Var;
        this.f7714t = co0Var;
        this.E = z7;
        this.f7715u = z8;
        co0Var.a(this);
        this.f7716v = rx1Var;
    }

    private final void C(boolean z7) {
        v2.n1.k("AdMediaPlayerView release");
        zn0 zn0Var = this.D;
        if (zn0Var != null) {
            zn0Var.d();
            this.D = null;
        }
        MediaPlayer mediaPlayer = this.f7719y;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f7719y.release();
            this.f7719y = null;
            F(0);
            if (z7) {
                this.f7718x = 0;
            }
        }
    }

    private final boolean D() {
        int i7;
        return (this.f7719y == null || (i7 = this.f7717w) == -1 || i7 == 0 || i7 == 1) ? false : true;
    }

    private final void E(float f8) {
        MediaPlayer mediaPlayer = this.f7719y;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f8, f8);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i7 = v2.n1.f26802b;
            w2.p.f("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void F(int i7) {
        if (i7 == 3) {
            this.f7714t.e();
            this.f9030r.d();
        } else if (this.f7717w == 3) {
            this.f7714t.f();
            this.f9030r.e();
        }
        this.f7717w = i7;
    }

    private final void Q() {
        rx1 rx1Var;
        v2.n1.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f7720z == null || surfaceTexture == null) {
            return;
        }
        C(false);
        try {
            r2.t.z();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f7719y = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f7719y.setOnCompletionListener(this);
            this.f7719y.setOnErrorListener(this);
            this.f7719y.setOnInfoListener(this);
            this.f7719y.setOnPreparedListener(this);
            this.f7719y.setOnVideoSizeChangedListener(this);
            this.C = 0;
            if (this.E) {
                if (((Boolean) s2.b0.c().d(uy.oe)).booleanValue() && (rx1Var = this.f7716v) != null) {
                    qx1 a8 = rx1Var.a();
                    a8.c("action", "svp_ampv");
                    a8.d();
                }
                zn0 zn0Var = new zn0(getContext());
                this.D = zn0Var;
                zn0Var.b(surfaceTexture, getWidth(), getHeight());
                zn0 zn0Var2 = this.D;
                zn0Var2.start();
                SurfaceTexture e8 = zn0Var2.e();
                if (e8 != null) {
                    surfaceTexture = e8;
                } else {
                    this.D.d();
                    this.D = null;
                }
            }
            this.f7719y.setDataSource(getContext(), this.f7720z);
            r2.t.A();
            this.f7719y.setSurface(new Surface(surfaceTexture));
            this.f7719y.setAudioStreamType(3);
            this.f7719y.setScreenOnWhilePlaying(true);
            this.f7719y.prepareAsync();
            F(1);
        } catch (IOException e9) {
            e = e9;
            w2.p.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f7720z)), e);
            onError(this.f7719y, 1, 0);
        } catch (IllegalArgumentException e10) {
            e = e10;
            w2.p.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f7720z)), e);
            onError(this.f7719y, 1, 0);
        } catch (IllegalStateException e11) {
            e = e11;
            w2.p.g("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f7720z)), e);
            onError(this.f7719y, 1, 0);
        }
    }

    final /* synthetic */ void G(int i7) {
        fn0 fn0Var = this.G;
        if (fn0Var != null) {
            fn0Var.onWindowVisibilityChanged(i7);
        }
    }

    final /* synthetic */ void H(MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue() || this.f7713s == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap hashMap = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    this.I = valueOf;
                                    hashMap.put("bitRate", String.valueOf(valueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    int integer = format2.getInteger("width");
                                    int integer2 = format2.getInteger("height");
                                    StringBuilder sb = new StringBuilder(String.valueOf(integer).length() + 1 + String.valueOf(integer2).length());
                                    sb.append(integer);
                                    sb.append("x");
                                    sb.append(integer2);
                                    hashMap.put("resolution", sb.toString());
                                }
                                if (format2.containsKey("mime")) {
                                    hashMap.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    hashMap.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                hashMap.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                hashMap.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                this.f7713s.B("onMetadataEvent", hashMap);
            }
        } catch (RuntimeException e8) {
            r2.t.l().i(e8, "AdMediaPlayerView.reportMetadata");
        }
    }

    final /* synthetic */ fn0 I() {
        return this.G;
    }

    final /* synthetic */ boolean J() {
        return this.H;
    }

    final /* synthetic */ void K(boolean z7) {
        this.H = true;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final String h() {
        return "MediaPlayer".concat(true != this.E ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void i(fn0 fn0Var) {
        this.G = fn0Var;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void j(String str) {
        Uri parse = Uri.parse(str);
        ut M0 = ut.M0(parse);
        if (M0 == null || M0.f16970q != null) {
            if (M0 != null) {
                parse = Uri.parse(M0.f16970q);
            }
            this.f7720z = parse;
            this.F = 0;
            Q();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void k() {
        v2.n1.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f7719y;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f7719y.release();
            this.f7719y = null;
            F(0);
            this.f7718x = 0;
        }
        this.f7714t.c();
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void l() {
        v2.n1.k("AdMediaPlayerView play");
        if (D()) {
            this.f7719y.start();
            F(3);
            this.f9029q.a();
            v2.f2.f26746l.post(new an0(this));
        }
        this.f7718x = 3;
    }

    @Override // com.google.android.gms.internal.ads.gn0, com.google.android.gms.internal.ads.eo0
    public final void m() {
        E(this.f9030r.c());
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void n() {
        v2.n1.k("AdMediaPlayerView pause");
        if (D() && this.f7719y.isPlaying()) {
            this.f7719y.pause();
            F(4);
            v2.f2.f26746l.post(new bn0(this));
        }
        this.f7718x = 4;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int o() {
        if (D()) {
            return this.f7719y.getDuration();
        }
        return -1;
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i7) {
        this.C = i7;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        v2.n1.k("AdMediaPlayerView completion");
        F(5);
        this.f7718x = 5;
        v2.f2.f26746l.post(new vm0(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
        Map map = J;
        String str = (String) map.get(Integer.valueOf(i7));
        String str2 = (String) map.get(Integer.valueOf(i8));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        String sb2 = sb.toString();
        int i9 = v2.n1.f26802b;
        w2.p.f(sb2);
        F(-1);
        this.f7718x = -1;
        v2.f2.f26746l.post(new wm0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i7, int i8) {
        Map map = J;
        String str = (String) map.get(Integer.valueOf(i7));
        String str2 = (String) map.get(Integer.valueOf(i8));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        v2.n1.k(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.A
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.B
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.A
            if (r2 <= 0) goto L7a
            int r2 = r5.B
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.zn0 r2 = r5.D
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.A
            int r1 = r0 * r7
            int r2 = r5.B
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.B
            int r0 = r0 * r6
            int r2 = r5.A
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.A
            int r1 = r1 * r7
            int r2 = r5.B
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.A
            int r4 = r5.B
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zn0 r6 = r5.D
            if (r6 == 0) goto L84
            r6.c(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.en0.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        v2.n1.k("AdMediaPlayerView prepared");
        F(2);
        this.f7714t.b();
        v2.f2.f26746l.post(new um0(this, mediaPlayer));
        this.A = mediaPlayer.getVideoWidth();
        this.B = mediaPlayer.getVideoHeight();
        int i7 = this.F;
        if (i7 != 0) {
            q(i7);
        }
        if (this.f7715u && D() && this.f7719y.getCurrentPosition() > 0 && this.f7718x != 3) {
            v2.n1.k("AdMediaPlayerView nudging MediaPlayer");
            E(0.0f);
            this.f7719y.start();
            int currentPosition = this.f7719y.getCurrentPosition();
            long a8 = r2.t.o().a();
            while (D() && this.f7719y.getCurrentPosition() == currentPosition && r2.t.o().a() - a8 <= 250) {
            }
            this.f7719y.pause();
            m();
        }
        int i8 = this.A;
        int i9 = this.B;
        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 40 + String.valueOf(i9).length());
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i8);
        sb.append(" x ");
        sb.append(i9);
        w2.p.e(sb.toString());
        if (this.f7718x == 3) {
            l();
        }
        m();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        v2.n1.k("AdMediaPlayerView surface created");
        Q();
        v2.f2.f26746l.post(new xm0(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        v2.n1.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f7719y;
        if (mediaPlayer != null && this.F == 0) {
            this.F = mediaPlayer.getCurrentPosition();
        }
        zn0 zn0Var = this.D;
        if (zn0Var != null) {
            zn0Var.d();
        }
        v2.f2.f26746l.post(new zm0(this));
        C(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        v2.n1.k("AdMediaPlayerView surface changed");
        int i9 = this.f7718x;
        boolean z7 = false;
        if (this.A == i7 && this.B == i8) {
            z7 = true;
        }
        if (this.f7719y != null && i9 == 3 && z7) {
            int i10 = this.F;
            if (i10 != 0) {
                q(i10);
            }
            l();
        }
        zn0 zn0Var = this.D;
        if (zn0Var != null) {
            zn0Var.c(i7, i8);
        }
        v2.f2.f26746l.post(new ym0(this, i7, i8));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f7714t.d(this);
        this.f9029q.b(surfaceTexture, this.G);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i7, int i8) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 35 + String.valueOf(i8).length());
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i7);
        sb.append(" x ");
        sb.append(i8);
        v2.n1.k(sb.toString());
        this.A = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.B = videoHeight;
        if (this.A == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 47);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i7);
        v2.n1.k(sb.toString());
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.cn0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                en0.this.G(i7);
            }
        });
        super.onWindowVisibilityChanged(i7);
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int p() {
        if (D()) {
            return this.f7719y.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void q(int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 23);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i7);
        v2.n1.k(sb.toString());
        if (!D()) {
            this.F = i7;
        } else {
            this.f7719y.seekTo(i7);
            this.F = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void r(float f8, float f9) {
        zn0 zn0Var = this.D;
        if (zn0Var != null) {
            zn0Var.f(f8, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int s() {
        MediaPlayer mediaPlayer = this.f7719y;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int t() {
        MediaPlayer mediaPlayer = this.f7719y;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = en0.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final long u() {
        if (this.I != null) {
            return (w() * this.C) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final long v() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final long w() {
        if (this.I != null) {
            return o() * this.I.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int x() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT < 26 || !D()) {
            return -1;
        }
        metrics = this.f7719y.getMetrics();
        return metrics.getInt("android.media.mediaplayer.dropped");
    }
}
