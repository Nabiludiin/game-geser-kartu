package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: MyApplication */
public final class nd4 extends ud3 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f12701e;

    /* renamed from: f, reason: collision with root package name */
    private final DatagramPacket f12702f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f12703g;

    /* renamed from: h, reason: collision with root package name */
    private DatagramSocket f12704h;

    /* renamed from: i, reason: collision with root package name */
    private MulticastSocket f12705i;

    /* renamed from: j, reason: collision with root package name */
    private InetAddress f12706j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12707k;

    /* renamed from: l, reason: collision with root package name */
    private int f12708l;

    public nd4(int i7) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f12701e = bArr;
        this.f12702f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final long b(cq3 cq3Var) {
        Uri uri = cq3Var.f6571a;
        this.f12703g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f12703g.getPort();
        c(cq3Var);
        try {
            this.f12706j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f12706j, port);
            if (this.f12706j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f12705i = multicastSocket;
                multicastSocket.joinGroup(this.f12706j);
                this.f12704h = this.f12705i;
            } else {
                this.f12704h = new DatagramSocket(inetSocketAddress);
            }
            this.f12704h.setSoTimeout(8000);
            this.f12707k = true;
            e(cq3Var);
            return -1L;
        } catch (IOException e8) {
            throw new mc4(e8, 2001);
        } catch (SecurityException e9) {
            throw new mc4(e9, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final Uri d() {
        return this.f12703g;
    }

    @Override // com.google.android.gms.internal.ads.yl3
    public final void h() {
        InetAddress inetAddress;
        this.f12703g = null;
        MulticastSocket multicastSocket = this.f12705i;
        if (multicastSocket != null) {
            try {
                inetAddress = this.f12706j;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.f12705i = null;
        }
        DatagramSocket datagramSocket = this.f12704h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f12704h = null;
        }
        this.f12706j = null;
        this.f12708l = 0;
        if (this.f12707k) {
            this.f12707k = false;
            g();
        }
    }

    @Override // com.google.android.gms.internal.ads.y95
    public final int r(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (this.f12708l == 0) {
            try {
                DatagramSocket datagramSocket = this.f12704h;
                if (datagramSocket == null) {
                    throw null;
                }
                DatagramPacket datagramPacket = this.f12702f;
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f12708l = length;
                f(length);
            } catch (SocketTimeoutException e8) {
                throw new mc4(e8, 2002);
            } catch (IOException e9) {
                throw new mc4(e9, 2001);
            }
        }
        int length2 = this.f12702f.getLength();
        int i9 = this.f12708l;
        int min = Math.min(i9, i8);
        System.arraycopy(this.f12701e, length2 - i9, bArr, i7, min);
        this.f12708l -= min;
        return min;
    }
}
