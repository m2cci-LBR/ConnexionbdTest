package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import metier.entities.Spectacles;

public class SpectacleDAOImpl implements ISpectacleDAO {

	@Override
	public Spectacles save(Spectacles s) {
		// Pour enregistrer un spectacle il faut d'abord une connexion
		Connection connection = SingletonConnexion.getConnection();
		try {

			PreparedStatement ps = connection.prepareStatement("INSERT INTO LesSpectacles (numS,nomS) VALUES (?,?) ");
			ps.setInt(1, s.getNumS());
			ps.setString(2, s.getNomS());
			// il s'agit d'une requete insert donc excecuteUpdate
			ps.executeUpdate();
			ps.close();
			// on ferme pas la connexion car il s'agit d'un singleton

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ? seront remplacer apres par leur valeurs
		return s;
	}

	public List<Spectacles> ListSpectacles() {
		List<Spectacles> specs = new ArrayList<Spectacles>();
		Connection conn = SingletonConnexion.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from LesSpectacles");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				Spectacles s = new Spectacles();
				s.setNumS(rs.getInt("numS"));
				s.setNomS(rs.getString("nomS"));

				// apres on va ajouter ce produit a la liste
				specs.add(s);
			}
			ps.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return specs;
	}

	@Override
	public List<Spectacles> spectaclesParMC(String mc) {

		List<Spectacles> prods = new ArrayList<Spectacles>();
		Connection conn = SingletonConnexion.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from LesSpectacles where numS like ?");
			ps.setString(1, "%" + mc + "%"); // qq soit la position des mots cles dans la designation

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				Spectacles p = new Spectacles();
				p.setNumS(rs.getInt("numS"));
				p.setNomS(rs.getString("nomS"));
				// apres on va ajouter ce produit a la liste
				prods.add(p);
			}
			ps.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prods;
	}

	@Override
	public Spectacles getSpectacles(int nums) {
		Spectacles p = null;
		Connection conn = SingletonConnexion.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from Spectacles where numS = ?");
			ps.setInt(1, nums); // qq soit la position des mots cles dans la designation

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				p = new Spectacles();
				p.setNumS(rs.getInt("numS"));
				p.setNomS(rs.getString("nomS"));
				// apres on va ajouter ce produit a la liste

			}
			ps.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (p == null)
			throw new RuntimeException("Spectacle" + nums + "introuvable"); // exception non surveille:pas besoin de try
																			// catch :exception non signale par le
																			// compilateur
		return p;
	}

	@Override
	public Spectacles update(Spectacles s) {
		Connection conn = SingletonConnexion.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into Spectacles(numS,nomS) values (?,?)");
			ps.setInt(1, s.getNumS());
			ps.setString(2, s.getNomS());

			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	@Override
	public void deleteSpectacles(int nums) {
		Connection conn = SingletonConnexion.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("delete from Spectacles  where numS=?");
			ps.setInt(1, nums);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
