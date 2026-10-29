package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* compiled from: MyApplication */
class j implements x0.c {

    /* renamed from: q, reason: collision with root package name */
    private final Context f2805q;

    /* renamed from: r, reason: collision with root package name */
    private final String f2806r;

    /* renamed from: s, reason: collision with root package name */
    private final File f2807s;

    /* renamed from: t, reason: collision with root package name */
    private final int f2808t;

    /* renamed from: u, reason: collision with root package name */
    private final x0.c f2809u;

    /* renamed from: v, reason: collision with root package name */
    private a f2810v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f2811w;

    j(Context context, String str, File file, int i7, x0.c cVar) {
        this.f2805q = context;
        this.f2806r = str;
        this.f2807s = file;
        this.f2808t = i7;
        this.f2809u = cVar;
    }

    private void a(File file) {
        ReadableByteChannel channel;
        if (this.f2806r != null) {
            channel = Channels.newChannel(this.f2805q.getAssets().open(this.f2806r));
        } else {
            if (this.f2807s == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f2807s).getChannel();
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f2805q.getCacheDir());
        createTempFile.deleteOnExit();
        w0.d.a(channel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private void e() {
        String databaseName = getDatabaseName();
        File databasePath = this.f2805q.getDatabasePath(databaseName);
        a aVar = this.f2810v;
        w0.a aVar2 = new w0.a(databaseName, this.f2805q.getFilesDir(), aVar == null || aVar.f2710j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e8) {
                    throw new RuntimeException("Unable to copy database file.", e8);
                }
            }
            if (this.f2810v == null) {
                aVar2.c();
                return;
            }
            try {
                int c8 = w0.c.c(databasePath);
                int i7 = this.f2808t;
                if (c8 == i7) {
                    aVar2.c();
                    return;
                }
                if (this.f2810v.a(c8, i7)) {
                    aVar2.c();
                    return;
                }
                if (this.f2805q.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath);
                    } catch (IOException e9) {
                        Log.w("ROOM", "Unable to copy database file.", e9);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar2.c();
                return;
            } catch (IOException e10) {
                Log.w("ROOM", "Unable to read database version.", e10);
                aVar2.c();
                return;
            }
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
        aVar2.c();
        throw th;
    }

    void c(a aVar) {
        this.f2810v = aVar;
    }

    @Override // x0.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2809u.close();
        this.f2811w = false;
    }

    @Override // x0.c
    public String getDatabaseName() {
        return this.f2809u.getDatabaseName();
    }

    @Override // x0.c
    public synchronized x0.b h0() {
        try {
            if (!this.f2811w) {
                e();
                this.f2811w = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2809u.h0();
    }

    @Override // x0.c
    public void setWriteAheadLoggingEnabled(boolean z7) {
        this.f2809u.setWriteAheadLoggingEnabled(z7);
    }
}
