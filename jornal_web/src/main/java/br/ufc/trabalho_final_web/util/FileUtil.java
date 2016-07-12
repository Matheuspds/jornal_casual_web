package br.ufc.trabalho_final_web.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	public static void salvarImagem(String path,MultipartFile imagem){
		System.out.println("SALVAR IMAGEM:" + path);
		File file = new File(path);
		try {
			FileUtils.writeByteArrayToFile(file,imagem.getBytes());
			System.out.println("SALVO EM:" + file);
			

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
