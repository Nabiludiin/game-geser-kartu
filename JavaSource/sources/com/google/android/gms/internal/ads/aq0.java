package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import java.util.Objects;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: MyApplication */
final class aq0 extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    final SSLSocketFactory f5209a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bq0 f5210b;

    aq0(bq0 bq0Var) {
        Objects.requireNonNull(bq0Var);
        this.f5210b = bq0Var;
        this.f5209a = (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    private final Socket a(Socket socket) {
        bq0 bq0Var = this.f5210b;
        if (bq0Var.l() > 0) {
            socket.setReceiveBufferSize(bq0Var.l());
        }
        bq0Var.j(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7) {
        Socket createSocket = this.f5209a.createSocket(str, i7);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f5209a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f5209a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7, InetAddress inetAddress, int i8) {
        Socket createSocket = this.f5209a.createSocket(str, i7, inetAddress, i8);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7) {
        Socket createSocket = this.f5209a.createSocket(inetAddress, i7);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7, InetAddress inetAddress2, int i8) {
        Socket createSocket = this.f5209a.createSocket(inetAddress, i7, inetAddress2, i8);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i7, boolean z7) {
        Socket createSocket = this.f5209a.createSocket(socket, str, i7, z7);
        a(createSocket);
        return createSocket;
    }
}
