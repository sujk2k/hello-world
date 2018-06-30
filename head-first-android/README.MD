1. How to debug on andoid device wirelessly using adb connect
step 1 - Connect device using usb in usb debugging mode
step 2 - Confirm device is listed using "adb devices" command
step 3 - Run "adb tcpip 5555"
step 4 - Disconnect device (remove usb cable)
step 5 - Make sure you are on same Wi-Fi network and get ip address of android device
(Settings -> About Phone -> Status)
step 6 - On host machine, run "adb connect <ip address of your device>:5555"
step 7 - Verify using "adb devices" that device is connected
