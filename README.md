# 1115

source code examples for intro to java in the `src` folder

## How to run the Hello World Program

`HelloWorld.java` is located in the src folder. To compile this source code from the command line, open a terminal and type the following line: 

```sh
cd src && javac HelloWorld.java && java Helloworld
```

## Running programs with packages

In your source code you might have defined a package name. To run such files, your code should be saved in a directory with the package name.

For example, `example/Hello.java` is defined with package `example` and saved in the subfolder `example` with the filename `Hello.java`. 

```
.
├── example
│   └── Hello.java
```

From the parent directory, you can run the following commands:

```sh
javac example/Hello.java
java example.Hello
```

The first command will create a `Hello.class` executable in the example folder.
The second command will refer to the Hello class that is in the example package/folder.

This line says change directory to `src` and compile `HelloWorld.java` and run the `HelloWorld` program.

## To record a terminal session

*on linux*

Start recording with the script command, like the following. This command says to save the log into a script file with today's date. It will create two files, one with the commands you've typed in and one with timing information.

```sh
script script-$(date +%F).log --timing=time-$(date +%F).txt
```

*on Mac*

The command for Mac is different from Linux due to different versions of software for different operating systems. You can view the manual pages for your version of script program that comes with your machine and terminal enviroment using the command `man script` (and type q to quit the manual). The `--timing` flag only comes with the linux version of the software so using it on Mac will result in a warning message.

On Mac run the command `script -r script-$(date +%F).log`

*on Windows*

The recommended approach is to [install WSL](https://docs.microsoft.com/en-us/windows/wsl/install) (with a linux operating system) to have a terminal environment on your machine. [Windows terminal](https://docs.microsoft.com/en-us/windows/terminal/) can be used to access this terminal environment.  That is the approach used by the instructor.

A lighter weight approach would be to install a console emulator that gives you access to a terminal through a virtual machine (https://cmder.net/). Any other approaches will not get much support in class. You might be able to try to copy and paste from the CMD prompt or git bash into a text tile, but it's not a reliable approach.
