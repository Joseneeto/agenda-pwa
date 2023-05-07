// service-worker.js

self.addEventListener('install', function(event) {
    event.waitUntil(
      caches.open('meu-app').then(function(cache) {
        return cache.addAll([
          '/',
          '/index.html',
          // Adicione aqui os caminhos para outros arquivos estáticos que deseja armazenar em cache

          './favicon.ico',
          './logo192.png',
          './logo512.png',

        ]);
      })
    );
  });
  
self.addEventListener('fetch', function(event) {
  event.respondWith(
    caches.match(event.request).then(function(response) {
      return response || fetch(event.request);
    })
  );
});
  