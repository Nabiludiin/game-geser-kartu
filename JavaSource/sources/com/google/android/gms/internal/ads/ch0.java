package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: MyApplication */
public final class ch0 extends q3.a {
    public static final Parcelable.Creator<ch0> CREATOR = new dh0();

    /* renamed from: q, reason: collision with root package name */
    ParcelFileDescriptor f6430q;

    /* renamed from: r, reason: collision with root package name */
    private Parcelable f6431r = null;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6432s = true;

    public ch0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6430q = parcelFileDescriptor;
    }

    public final q3.d M0(Parcelable.Creator creator) {
        if (this.f6432s) {
            if (this.f6430q == null) {
                int i7 = v2.n1.f26802b;
                w2.p.c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f6430q));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    com.google.android.gms.common.util.l.a(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.f6431r = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.f6432s = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e8) {
                    int i8 = v2.n1.f26802b;
                    w2.p.d("Could not read from parcel file descriptor", e8);
                    com.google.android.gms.common.util.l.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                com.google.android.gms.common.util.l.a(dataInputStream);
                throw th2;
            }
        }
        return (q3.d) this.f6431r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] createPipe;
        if (this.f6430q == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f6431r.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e8) {
                    e = e8;
                    autoCloseOutputStream = null;
                }
                try {
                    cm0.f6500a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bh0
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            DataOutputStream dataOutputStream;
                            Parcelable.Creator<ch0> creator = ch0.CREATOR;
                            byte[] bArr = marshall;
                            OutputStream outputStream = autoCloseOutputStream;
                            DataOutputStream dataOutputStream2 = null;
                            try {
                                try {
                                    dataOutputStream = new DataOutputStream(outputStream);
                                } catch (IOException e9) {
                                    e = e9;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                com.google.android.gms.common.util.l.a(dataOutputStream);
                            } catch (IOException e10) {
                                e = e10;
                                dataOutputStream2 = dataOutputStream;
                                int i8 = v2.n1.f26802b;
                                w2.p.d("Error transporting the ad response", e);
                                r2.t.l().i(e, "LargeParcelTeleporter.pipeData.1");
                                if (dataOutputStream2 == null) {
                                    com.google.android.gms.common.util.l.a(outputStream);
                                } else {
                                    com.google.android.gms.common.util.l.a(dataOutputStream2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 == null) {
                                    com.google.android.gms.common.util.l.a(outputStream);
                                } else {
                                    com.google.android.gms.common.util.l.a(dataOutputStream2);
                                }
                                throw th;
                            }
                        }
                    });
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e9) {
                    e = e9;
                    int i8 = v2.n1.f26802b;
                    w2.p.d("Error transporting the ad response", e);
                    r2.t.l().i(e, "LargeParcelTeleporter.pipeData.2");
                    com.google.android.gms.common.util.l.a(autoCloseOutputStream);
                    this.f6430q = parcelFileDescriptor;
                    int a8 = q3.c.a(parcel);
                    q3.c.q(parcel, 2, this.f6430q, i7, false);
                    q3.c.b(parcel, a8);
                }
                this.f6430q = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a82 = q3.c.a(parcel);
        q3.c.q(parcel, 2, this.f6430q, i7, false);
        q3.c.b(parcel, a82);
    }
}
