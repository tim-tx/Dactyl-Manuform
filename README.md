# The Dactyl-ManuForm Keyboard
This fork of [Dactyl-Manuform](https://github.com/tshort/dactyl-keyboard) consists some minor modifications to the design and a new build guide.

I have also added the keyboard to the QMK firmware [Dactyl-Manuform QMK firmware](https://github.com/qmk/qmk_firmware/tree/master/keyboards/handwired/dactyl_manuform)

![Imgur](https://i.imgur.com/7y0Vbyd.jpg)

## Build guide

### Parts list
> The parts in the list are for two sides of 4x5 keyboard.
* [Arduino Pro-Micro](https://www.sparkfun.com/products/12640) 2x
* [M3 x 3mm Heat-set inserts](https://www.amazon.com/uxcell-Female-Knurled-Threaded-Embedment/dp/B01IYWTCWW) 10x
* [M3 wafer-head screws, 5mm](http://www.metricscrews.us/index.php?main_page=product_info&cPath=155_185&products_id=455) 10x
* [6mm Copper tape](https://www.adafruit.com/product/1128)
* [1N4148 diodes](https://www.amazon.com/gp/product/B00LQPY0Y0) 46x
* [Cherry MX compatible keyswitchs]()
* [Female RJ-9 connectors](https://www.amazon.com/Female-Telephone-Connector-Adapter-Wires/dp/B00N41BEQQ) 2x
* [1.6mm 3:1 Heat Shrink tube]()
* [RJ9 Telephone Modem Coil 9.3-Inch](https://www.amazon.com/Uxcell-Telephone-Modem-9-3-Inch-Landline/dp/B0055XMA0A) 1x
* [5pin Female-Female jumperwire](https://www.sparkfun.com/products/10370) 2x
* [1pin Female-Female jumperwire](https://www.amazon.com/uxcell-Female-Jumper-Cable-Wires/dp/B00D7SDDLU) 6x

### Rows wiring
First insert keyswitchs in place, make sure they are sturdy in place, glue them in place if they aren't.
Take the copper tape and gently tape it over the rows internal keyswitch pins, be careful not to tear it, look at the picture below to see where each row follow in the thumb cluster keys.
![Imgur](https://i.imgur.com/Qt7Pcpf.jpg)
Now solder each one of the keyswitch pins to the copper tape.
![Imgur](https://i.imgur.com/iVVmwpN.jpg)

### Columns wiring
To wire the columns we use the diods legs as wires connecting each one, follow the pictures below. cut and bend the diods as shown and solder the diods to the outer keyswitch pin.
between each connection that goes over a copper tape insert a shrink tube to insulate and prevent circuit short.
the diods should always be in the direction in the pictures (black strip opposite to the keyswitch pin)
![Imgur](https://i.imgur.com/XBjySSH.jpg)
![Imgur](https://i.imgur.com/06QiBQt.jpg)
![Imgur](https://i.imgur.com/9ropMpG.jpg)

### RJ9 Jack wiring
On one of the jacks solder the green, red and black wires each to a single pin jumper wire, on the other side solder the yellow wire instead of the black one.

insert the jack inside the case, you will need to cut the jack a little bit to make it fit.


### Jumper wires wiring
Cut the 5pin jumperwire to half and with each half solder the wires to the board, one to each of the copper rows and the other to each column as shown in the picture
![Imgur](https://i.imgur.com/NiF3bXK.jpg)
![Imgur](https://i.imgur.com/4DXnqu5.jpg)

### Pro-micro soldering
Most of the controllers comes with set of pinheaders, solder them on top of the board.

### Pro-micro and Jack connection
Once all wires are solderd you just need to plug the jumper wires to the pro-micro correctly
![Imgur](https://i.imgur.com/SkGqEsF.jpg)

### Firmware

Firmware goes hand in hand with how you wire the circuit. 
I adapted the QMK firmware [here](https://github.com/tshort/qmk_firmware/tree/master/keyboards/dactyl-manuform). 
This allows each side to work separately or together. 
This site also shows connections for the Arduino Pro Micro controllers.

## License

Copyright © 2015-2017 Matthew Adereth and Tom Short

The source code for generating the models (everything excluding the [things/](things/) and [resources/](resources/) directories is distributed under the [GNU AFFERO GENERAL PUBLIC LICENSE Version 3](LICENSE).  The generated models and PCB designs are distributed under the [Creative Commons Attribution-NonCommercial-ShareAlike License Version 3.0](LICENSE-models).
