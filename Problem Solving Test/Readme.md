Untuk menganalisis kompleksitas kodingan di atas, saya tinjau setiap bagian programnya:

saya menggunakan satu perulangan for yang mengiterasi melalui setiap karakter dalam string input. Perulangan ini memiliki kompleksitas O(n), di mana 'n' adalah panjang string input.

Di dalam perulangan, saya hanya melakukan operasi operasi sederhana seperti memasukkan dan mengeluarkan elemen dari tumpukan (stack). Operasi ini memiliki kompleksitas O(1).

Jadi, secara keseluruhan kompleksitas kodingan ini adalah O(n) di mana 'n' adalah panjang dari string input.

Dalam analisis Big O notation, kompleksitas O(n) dapat dianggap sebagai kompleksitas paling rendah karena program ini harus memproses setiap karakter dalam string minimal sekali.

Jadi, kompleksitas kodingan di atas adalah O(n).


Dalam code sebelumnya, saya menggunakan pendekatan dengan menggunakan tumpukan (stack) untuk menemukan apakah string yang diberikan mengandung pasangan braket yang seimbang atau tidak. Saya akan memproses setiap karakter dalam string dan memeriksa apakah karakter tersebut adalah braket buka atau braket tutup. Berikut ini adalah detail kompleksitas codingan untuk fungsi isBalanced:

Iterasi melalui setiap karakter dalam string input menggunakan perulangan for:

Kompleksitas: O(n), di mana 'n' adalah panjang dari string input.
Dalam perulangan, operasi yang dilakukan adalah sebagai berikut:

Jika karakter adalah braket buka (seperti '{', '[', atau '('), maka karakter tersebut dimasukkan ke dalam tumpukan (stack). Operasi ini memiliki kompleksitas O(1), karena menambahkan elemen ke dalam tumpukan memerlukan waktu konstan.
Jika karakter adalah braket tutup (seperti '}', ']', atau ')'), maka saya memeriksa apakah braket tutup tersebut sesuai dengan braket buka yang ada di tumpukan. Operasi ini melibatkan menghapus elemen dari tumpukan (pop) dan membandingkan karakter, yang juga memiliki kompleksitas O(1).
Selain itu, ada pula operasi lain seperti stack.isEmpty() yang memeriksa apakah tumpukan kosong atau tidak, dan mengembalikan stack.isEmpty() juga memiliki kompleksitas O(1).

Pada akhirnya, saya mengembalikan hasil akhir berdasarkan apakah tumpukan kosong atau tidak.

Jadi, kompleksitas utama dari fungsi isBalanced adalah O(n), di mana 'n' adalah panjang dari string input. Operasi-operasi yang dilakukan di dalam perulangan, seperti memasukkan karakter ke dalam tumpukan dan menghapus karakter dari tumpukan, memiliki kompleksitas O(1) dan tidak memiliki dampak signifikan pada keseluruhan kompleksitas.

Sehingga, dengan menggunakan pendekatan tumpukan, kodingan ini mencapai kompleksitas paling rendah O(n), yang sangat efisien untuk menyelesaikan masalah "Balanced Bracket" pada string.