package com.abm.maasapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.core.view.get
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*
import com.abm.maasapp.databinding.ActivityMainBinding
import com.abm.maasapp.ui.home.viewmodel.NavigationViewModelImp
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: NavigationViewModelImp by viewModels()
    private var navController:NavController?=null
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.menu.itemIconTintList = null

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        navController = navHostFragment.navController
        initObservers()

        /*val drawerLayout: DrawerLayout = binding.mainDrawer
        val navView: NavigationView = binding.navView

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.profileFragment, R.id.privacyFragment, R.id.helpFragment2,
            ), drawerLayout
        )
        setupActionBarWithNavController(navController!!, appBarConfiguration)
        navView.setupWithNavController(navController!!)*/

            binding.menu.apply {
            menu[0].setIcon(R.drawable.home_selector)
            menu[1].setIcon(R.drawable.more_pay_selectore)
            menu[2].setIcon(R.drawable.key_card_selector)

            navController?.let { navController ->
                NavigationUI.setupWithNavController(
                    this,
                    navController
                )
                navController.addOnDestinationChangedListener { _, destination, _ ->
                    run {
                        if (destination.id == R.id.OTPMorePayFragment || destination.id == R.id.loaderFragment)
                            binding.menu.visibility = View.GONE
                        else {
                            binding.menu.visibility = View.VISIBLE
                        }
                    }
                }

                setOnItemSelectedListener { item ->
                    NavigationUI.onNavDestinationSelected(item, navController)
                    val selectedMenuItemNavGraph =
                        navController.graph.findNode(item.itemId) as NavGraph
                    selectedMenuItemNavGraph.let { menuGraph ->
                        navController.popBackStack(menuGraph.startDestinationId, false)
                    }
                    true
                }
                setOnItemReselectedListener {

                }
            }
        }
    }

    private fun initObservers() {
        viewModel.goHomeBackPressed_.observe(this){
            if (it){
               /* val selectedMenuItemNavGraph =
                    navController?.graph.findNode(item.itemId) as NavGraph
                selectedMenuItemNavGraph.let { menuGraph ->
                    navController?.popBackStack(menuGraph.startDestinationId, false)
                }*/
            }
        }
    }

    /*override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_container)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }*/

}