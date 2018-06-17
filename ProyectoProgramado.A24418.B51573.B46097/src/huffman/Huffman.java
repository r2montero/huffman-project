package huffman;

import Exceptions.HuffmanException;
import dataStructures.*;

import java.io.*;

public class Huffman {

    public void compress() throws HuffmanException {
        File file = FilesManager.chooseFile();
        if(file==null) {
            throw new HuffmanException("No se ha seleccionado ningun archivo");
        }
        LinkedList charsList = new LinkedList();
        BinarySearchTree charsTree = new BinarySearchTree();

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int c = br.read();

            while (c!=-1) {
                charsTree.add((char)c);
                charsList.insert((char)c);
                c = br.read();
            }
        } catch (IOException e) {
            throw new HuffmanException("El archivo seleccionado no es valido");
        }


    }
}
